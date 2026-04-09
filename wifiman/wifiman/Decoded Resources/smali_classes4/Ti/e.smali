.class public final synthetic LTi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LTi/f;

.field public final synthetic b:LTi/f$a;


# direct methods
.method public synthetic constructor <init>(LTi/f;LTi/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTi/e;->a:LTi/f;

    iput-object p2, p0, LTi/e;->b:LTi/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LTi/e;->a:LTi/f;

    iget-object v1, p0, LTi/e;->b:LTi/f$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LTi/f$a;->c(LTi/f;LTi/f$a;Ljava/lang/Throwable;)LYg/J;

    move-result-object p1

    return-object p1
.end method
