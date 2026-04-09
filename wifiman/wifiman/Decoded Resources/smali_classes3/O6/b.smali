.class public LO6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO6/a;


# instance fields
.field final a:LO6/h;


# direct methods
.method public constructor <init>(Lgg/y;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LO6/h;

    invoke-direct {v0}, LO6/h;-><init>()V

    iput-object v0, p0, LO6/b;->a:LO6/h;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LO6/b$a;

    invoke-direct {v1, p0, p1}, LO6/b$a;-><init>(LO6/b;Lgg/y;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public a(LM6/j;)Lgg/s;
    .locals 1

    new-instance v0, LO6/b$b;

    invoke-direct {v0, p0, p1}, LO6/b$b;-><init>(LO6/b;LM6/j;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
