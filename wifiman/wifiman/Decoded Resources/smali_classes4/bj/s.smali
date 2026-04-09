.class public final synthetic Lbj/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LXi/f;

.field public final synthetic b:Laj/b;


# direct methods
.method public synthetic constructor <init>(LXi/f;Laj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbj/s;->a:LXi/f;

    iput-object p2, p0, Lbj/s;->b:Laj/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbj/s;->a:LXi/f;

    iget-object v1, p0, Lbj/s;->b:Laj/b;

    invoke-static {v0, v1}, Lbj/t;->a(LXi/f;Laj/b;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
