.class public final synthetic LXb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LXb/g;


# direct methods
.method public synthetic constructor <init>(LXb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXb/f;->a:LXb/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXb/f;->a:LXb/g;

    check-cast p1, Lo/t;

    invoke-static {v0, p1}, LXb/g;->t(LXb/g;Lo/t;)LYg/J;

    move-result-object p1

    return-object p1
.end method
