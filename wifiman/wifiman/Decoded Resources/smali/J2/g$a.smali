.class public LJ2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 3

    new-instance v0, LJ2/g;

    const-class v1, LI2/h;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, LI2/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LI2/n;

    move-result-object p1

    invoke-direct {v0, p1}, LJ2/g;-><init>(LI2/n;)V

    return-object v0
.end method
