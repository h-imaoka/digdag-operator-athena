package pro.civitaspo.digdag.plugin.athena.aws


import com.amazonaws.services.s3.AmazonS3URI

object AmazonS3UriWrapper
{

    def apply(path: String): AmazonS3URI =
    {
        new AmazonS3URI(path, false)
    }
}
