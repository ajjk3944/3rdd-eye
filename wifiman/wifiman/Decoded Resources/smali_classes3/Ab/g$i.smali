.class final LAb/g$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAb/g;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LAb/g;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(LAb/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LAb/g$i;->a:LAb/g;

    iput-object p2, p0, LAb/g$i;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LAb/g$i;->a:LAb/g;

    invoke-static {p1}, LAb/g;->B(LAb/g;)LGb/f;

    move-result-object p1

    iget-object v0, p0, LAb/g$i;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, LGb/f;->n(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, LAb/g$i;->a(LEb/r;)V

    return-void
.end method
