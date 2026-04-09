.class public LJ2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/c$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 1

    new-instance p1, LJ2/c;

    iget-object v0, p0, LJ2/c$a;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, LJ2/c;-><init>(Landroid/content/Context;)V

    return-object p1
.end method
