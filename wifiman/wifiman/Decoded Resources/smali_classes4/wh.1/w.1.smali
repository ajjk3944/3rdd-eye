.class Lwh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LBh/b0;


# direct methods
.method public constructor <init>(LBh/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/w;->a:LBh/b0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/w;->a:LBh/b0;

    invoke-static {v0}, Lwh/A;->I(LBh/b0;)LBh/V;

    move-result-object v0

    return-object v0
.end method
