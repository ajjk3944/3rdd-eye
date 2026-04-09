.class final LAb/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAb/g;->j(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LAb/g;


# direct methods
.method constructor <init>(Ljava/lang/String;LAb/g;)V
    .locals 0

    iput-object p1, p0, LAb/g$g;->a:Ljava/lang/String;

    iput-object p2, p0, LAb/g$g;->b:LAb/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LAb/g$g;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, LAb/g$g;->b:LAb/g;

    invoke-static {v0}, LAb/g;->B(LAb/g;)LGb/f;

    move-result-object v0

    invoke-interface {v0, p1}, LGb/f;->n(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, LAb/g$g;->a(LEb/r;)V

    return-void
.end method
