.class public final synthetic LW9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Ls9/d;

    invoke-static {p1, p2}, LW9/e;->g0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
