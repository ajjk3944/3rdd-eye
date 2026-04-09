.class public final synthetic LC9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;


# direct methods
.method public synthetic constructor <init>(LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/p;->a:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC9/p;->a:LT/q0;

    check-cast p1, Lk0/l;

    invoke-static {v0, p1}, LC9/s;->b(LT/q0;Lk0/l;)LYg/J;

    move-result-object p1

    return-object p1
.end method
