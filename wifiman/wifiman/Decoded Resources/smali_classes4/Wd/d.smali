.class public final synthetic LWd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Ljava/io/FileOutputStream;

.field public final synthetic b:Lokhttp3/ResponseBody;


# direct methods
.method public synthetic constructor <init>(Ljava/io/FileOutputStream;Lokhttp3/ResponseBody;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWd/d;->a:Ljava/io/FileOutputStream;

    iput-object p2, p0, LWd/d;->b:Lokhttp3/ResponseBody;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, LWd/d;->a:Ljava/io/FileOutputStream;

    iget-object v1, p0, LWd/d;->b:Lokhttp3/ResponseBody;

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->d(Ljava/io/FileOutputStream;Lokhttp3/ResponseBody;)V

    return-void
.end method
