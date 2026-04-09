.class LBh/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LBh/e0;


# direct methods
.method public constructor <init>(LBh/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/c0;->a:LBh/e0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBh/c0;->a:LBh/e0;

    invoke-static {v0}, LBh/e0;->a(LBh/e0;)Lii/k;

    move-result-object v0

    return-object v0
.end method
