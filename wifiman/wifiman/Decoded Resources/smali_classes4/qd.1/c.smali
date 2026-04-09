.class public final synthetic Lqd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lqd/b;


# direct methods
.method public synthetic constructor <init>(Lqd/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/c;->a:Lqd/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqd/c;->a:Lqd/b;

    check-cast p1, Lqd/d;

    invoke-static {v0, p1}, Lqd/b$d;->k(Lqd/b;Lqd/d;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
