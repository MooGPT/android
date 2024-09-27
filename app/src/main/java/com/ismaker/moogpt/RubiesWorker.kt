class RubiesWorker(appReference: reference, workerParams: WorkerParameters):
    Worker(appReference, workerParams) {

    override fun doWork(): Result {
        // Check membership status and update rubies
        return Result.success()
    }
    }
