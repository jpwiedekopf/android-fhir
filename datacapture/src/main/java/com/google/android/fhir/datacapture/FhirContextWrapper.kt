package com.google.android.fhir.datacapture

import android.util.Log
import ca.uhn.fhir.context.FhirContext

class FhirContextWrapper {
    companion object {
        val fhirContext : FhirContext = FhirContext.forR4()
        private const val TAG = "FhirContextWrapper"
        init {
            Log.d(TAG, "loaded FHIR context: ${fhirContext.version}")
        }
    }
}