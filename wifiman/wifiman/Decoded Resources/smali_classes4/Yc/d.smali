.class public final synthetic LYc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:Landroid/net/NetworkRequest;

.field public final synthetic b:LYc/g;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/net/NetworkRequest;LYc/g;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYc/d;->a:Landroid/net/NetworkRequest;

    iput-object p2, p0, LYc/d;->b:LYc/g;

    iput-object p3, p0, LYc/d;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 3

    iget-object v0, p0, LYc/d;->a:Landroid/net/NetworkRequest;

    iget-object v1, p0, LYc/d;->b:LYc/g;

    iget-object v2, p0, LYc/d;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, LYc/g;->a(Landroid/net/NetworkRequest;LYc/g;Ljava/lang/String;Lgg/j;)V

    return-void
.end method
