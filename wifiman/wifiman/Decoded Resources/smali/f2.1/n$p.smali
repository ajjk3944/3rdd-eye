.class public final Lf2/n$p;
.super Lc/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lf2/n;


# direct methods
.method constructor <init>(Lf2/n;)V
    .locals 0

    iput-object p1, p0, Lf2/n$p;->d:Lf2/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lc/F;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    iget-object v0, p0, Lf2/n$p;->d:Lf2/n;

    invoke-virtual {v0}, Lf2/n;->Z()Z

    return-void
.end method
