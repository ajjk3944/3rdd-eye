.class LNh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/f;


# direct methods
.method public constructor <init>(LNh/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/e;->a:LNh/f;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/e;->a:LNh/f;

    invoke-static {v0}, LNh/f;->h(LNh/f;)[Lii/k;

    move-result-object v0

    return-object v0
.end method
