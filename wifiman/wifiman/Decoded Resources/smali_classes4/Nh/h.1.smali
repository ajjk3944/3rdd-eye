.class LNh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/j;


# direct methods
.method public constructor <init>(LNh/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/h;->a:LNh/j;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/h;->a:LNh/j;

    invoke-static {v0}, LNh/j;->c(LNh/j;)Lpi/d0;

    move-result-object v0

    return-object v0
.end method
