package be.tarsos.dsp.util;

import java.io.File;

/**
 * Created by Damiano Giusti on 17/09/2021.
 */
public final class FFMPEGLocator {

    private static File ffmpegDirectory = null;

    public static void setFfmpegDirectory(File ffmpegDirectory) {
        FFMPEGLocator.ffmpegDirectory = ffmpegDirectory;
    }

    public static File getFfmpegDirectory() {
        return ffmpegDirectory;
    }
}
