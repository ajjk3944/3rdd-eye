.class abstract LJ2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/Class;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/d$a;->a:Landroid/content/Context;

    iput-object p2, p0, LJ2/d$a;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final d(LI2/r;)LI2/n;
    .locals 5

    new-instance v0, LJ2/d;

    iget-object v1, p0, LJ2/d$a;->a:Landroid/content/Context;

    const-class v2, Ljava/io/File;

    iget-object v3, p0, LJ2/d$a;->b:Ljava/lang/Class;

    invoke-virtual {p1, v2, v3}, LI2/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LI2/n;

    move-result-object v2

    const-class v3, Landroid/net/Uri;

    iget-object v4, p0, LJ2/d$a;->b:Ljava/lang/Class;

    invoke-virtual {p1, v3, v4}, LI2/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LI2/n;

    move-result-object p1

    iget-object v3, p0, LJ2/d$a;->b:Ljava/lang/Class;

    invoke-direct {v0, v1, v2, p1, v3}, LJ2/d;-><init>(Landroid/content/Context;LI2/n;LI2/n;Ljava/lang/Class;)V

    return-object v0
.end method
