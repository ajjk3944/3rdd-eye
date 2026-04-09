.class final Lcom/ui/wmw/api/v1/f$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$e;->c(Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$e$b;->a:Lkotlin/jvm/internal/L;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wmw/api/v1/f$e$b;->a:Lkotlin/jvm/internal/L;

    const/4 v0, 0x0

    iput v0, p1, Lkotlin/jvm/internal/L;->a:I

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$e$b;->a(Lhg/c;)V

    return-void
.end method
