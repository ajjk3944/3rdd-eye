.class final LBc/f$x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f$x;->a(LBc/f$c;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, LBc/f$x$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LBc/f$e;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBc/f$f;

    if-eqz p1, :cond_0

    new-instance v0, LBc/f$e$a;

    invoke-direct {v0, p1}, LBc/f$e$a;-><init>(LBc/f$f;)V

    goto :goto_0

    :cond_0
    new-instance v0, LBc/f$e$b;

    new-instance p1, LBc/a$b$b$e;

    iget v1, p0, LBc/f$x$a;->a:I

    invoke-direct {p1, v1}, LBc/a$b$b$e;-><init>(I)V

    invoke-direct {v0, p1}, LBc/f$e$b;-><init>(LBc/a$b$b;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LBc/f$x$a;->a(Ll9/a;)LBc/f$e;

    move-result-object p1

    return-object p1
.end method
