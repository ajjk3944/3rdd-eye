.class public final synthetic LF9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/g0;->a:LT/q0;

    iput-object p2, p0, LF9/g0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF9/g0;->a:LT/q0;

    iget-object v1, p0, LF9/g0;->b:Ljava/lang/String;

    check-cast p1, Lk0/l;

    invoke-static {v0, v1, p1}, LF9/k0$a;->e(LT/q0;Ljava/lang/String;Lk0/l;)LYg/J;

    move-result-object p1

    return-object p1
.end method
