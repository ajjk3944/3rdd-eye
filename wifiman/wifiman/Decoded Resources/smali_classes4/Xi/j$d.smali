.class public final LXi/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXi/j;->b(LXi/f;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LXi/f;


# direct methods
.method public constructor <init>(LXi/f;)V
    .locals 0

    iput-object p1, p0, LXi/j$d;->a:LXi/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LXi/j$b;

    iget-object v1, p0, LXi/j$d;->a:LXi/f;

    invoke-direct {v0, v1}, LXi/j$b;-><init>(LXi/f;)V

    return-object v0
.end method
