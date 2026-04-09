.class final Lrc/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrc/h;->a()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrc/h;


# direct methods
.method constructor <init>(Lrc/h;)V
    .locals 0

    iput-object p1, p0, Lrc/h$g;->a:Lrc/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LMb/c;)Lgg/f;
    .locals 2

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lrc/h$g;->a:Lrc/h;

    invoke-static {p1}, Lrc/h;->l(Lrc/h;)Lgg/z;

    move-result-object p1

    new-instance v0, Lrc/h$g$a;

    iget-object v1, p0, Lrc/h$g;->a:Lrc/h;

    invoke-direct {v0, v1}, Lrc/h$g$a;-><init>(Lrc/h;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMb/c;

    invoke-virtual {p0, p1}, Lrc/h$g;->a(LMb/c;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
