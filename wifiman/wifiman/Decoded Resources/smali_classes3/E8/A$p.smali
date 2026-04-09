.class final LE8/A$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->t0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/A;


# direct methods
.method constructor <init>(LE8/A;)V
    .locals 0

    iput-object p1, p0, LE8/A$p;->a:LE8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljf/f;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LE8/A$p;->a:LE8/A;

    invoke-static {p1}, LE8/A;->C0(LE8/A;)Lrc/b;

    move-result-object p1

    invoke-interface {p1}, Lrc/b;->a()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljf/f;

    invoke-virtual {p0, p1}, LE8/A$p;->a(Ljf/f;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
