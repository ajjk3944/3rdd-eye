.class public final synthetic LF4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/b;


# instance fields
.field public final synthetic a:LF4/n;

.field public final synthetic b:LF4/c;


# direct methods
.method public synthetic constructor <init>(LF4/n;LF4/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF4/k;->a:LF4/n;

    iput-object p2, p0, LF4/k;->b:LF4/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF4/k;->a:LF4/n;

    iget-object v1, p0, LF4/k;->b:LF4/c;

    invoke-static {v0, v1}, LF4/n;->j(LF4/n;LF4/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
