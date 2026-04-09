.class public final synthetic LI7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/wireguard/android/backend/GoBackend$b;


# instance fields
.field public final synthetic a:LI7/f;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(LI7/f;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/b;->a:LI7/f;

    iput-object p2, p0, LI7/b;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LI7/b;->a:LI7/f;

    iget-object v1, p0, LI7/b;->b:Lmh/l;

    invoke-static {v0, v1}, LI7/f;->h(LI7/f;Lmh/l;)V

    return-void
.end method
