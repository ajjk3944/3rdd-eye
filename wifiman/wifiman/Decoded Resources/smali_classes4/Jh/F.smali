.class LJh/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LJh/G;


# direct methods
.method public constructor <init>(LJh/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJh/F;->a:LJh/G;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJh/F;->a:LJh/G;

    invoke-static {v0}, LJh/G;->a(LJh/G;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
