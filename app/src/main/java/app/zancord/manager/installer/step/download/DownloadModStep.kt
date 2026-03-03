package app.zancord.manager.installer.step.download

import androidx.compose.runtime.Stable
import app.zancord.manager.R
import app.zancord.manager.installer.step.download.base.DownloadStep
import java.io.File

/**
 * Downloads the Zancord XPosed module
 *
 * https://github.com/zanfiel/zancord-xposed
 */
@Stable
class DownloadModStep(
    workingDir: File
): DownloadStep() {

    override val nameRes = R.string.step_dl_mod

    override val downloadFullUrl: String = "https://github.com/zanfiel/zancord-xposed/releases/latest/download/app-release.apk"
    override val destination = preferenceManager.moduleLocation
    override val workingCopy = workingDir.resolve("xposed.apk")

}
