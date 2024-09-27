val db = FirebaseFirestore.getInstance()

fun updateMembership(userId: String, membership: Membership) {
    db.collection("memberships").document(userId).set(membership)
}

fun getMembership(userId: String, callback: (Membership) -> Unit) {
    db.collection("memberships").document(userId).get()
        .addOnSuccessListener { document ->
            val membership = document.toObject(Membership::class.java)
            membership?.let { callback(it) }
        }
}

data class Membership(
    val isMember: Boolean,
    val rubiesPerMonth: Int,
    val adFree: Boolean
)

if (membership.adFree) {
    adView.visibility = View.GONE
} else {
    adView.visibility = View.VISIBLE
}
