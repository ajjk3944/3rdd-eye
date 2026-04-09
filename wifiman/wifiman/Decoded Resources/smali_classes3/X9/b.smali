.class public final synthetic LX9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LX9/c;


# direct methods
.method public synthetic constructor <init>(LX9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/b;->a:LX9/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LX9/b;->a:LX9/c;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Ls9/d;

    invoke-static {v0, p1, p2}, LX9/c;->K0(LX9/c;Ljava/lang/Throwable;Ls9/d;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
