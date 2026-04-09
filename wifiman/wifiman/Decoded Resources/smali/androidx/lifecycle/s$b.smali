.class Landroidx/lifecycle/s$b;
.super Landroidx/lifecycle/s$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Landroidx/lifecycle/s;


# direct methods
.method constructor <init>(Landroidx/lifecycle/s;Landroidx/lifecycle/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/s$b;->e:Landroidx/lifecycle/s;

    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/s$d;-><init>(Landroidx/lifecycle/s;Landroidx/lifecycle/v;)V

    return-void
.end method


# virtual methods
.method d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
