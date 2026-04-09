.class final Lcom/ui/wmw/api/v1/f$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/api/v1/f$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/api/v1/f$e$a;

    invoke-direct {v0}, Lcom/ui/wmw/api/v1/f$e$a;-><init>()V

    sput-object v0, Lcom/ui/wmw/api/v1/f$e$a;->a:Lcom/ui/wmw/api/v1/f$e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/r;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;

    const-string v1, "Failed to load fw file content"

    invoke-direct {v0, v1, p1}, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e$a;->a(Ljava/lang/Throwable;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
