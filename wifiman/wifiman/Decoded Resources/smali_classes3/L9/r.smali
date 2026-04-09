.class public final synthetic LL9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lr/C;

.field public final synthetic b:LIi/N;


# direct methods
.method public synthetic constructor <init>(Lr/C;LIi/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/r;->a:Lr/C;

    iput-object p2, p0, LL9/r;->b:LIi/N;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LL9/r;->a:Lr/C;

    iget-object v1, p0, LL9/r;->b:LIi/N;

    check-cast p1, LY0/r;

    invoke-static {v0, v1, p1}, LL9/q$c$a$a;->c(Lr/C;LIi/N;LY0/r;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
