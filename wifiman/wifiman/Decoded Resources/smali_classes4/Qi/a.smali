.class public final synthetic LQi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lhg/c;


# direct methods
.method public synthetic constructor <init>(Lhg/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQi/a;->a:Lhg/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQi/a;->a:Lhg/c;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LQi/b;->a(Lhg/c;Ljava/lang/Throwable;)LYg/J;

    move-result-object p1

    return-object p1
.end method
