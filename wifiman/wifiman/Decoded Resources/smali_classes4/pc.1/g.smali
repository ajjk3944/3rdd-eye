.class public final synthetic Lpc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lgg/A;


# direct methods
.method public synthetic constructor <init>(Lgg/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/g;->a:Lgg/A;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpc/g;->a:Lgg/A;

    check-cast p1, Landroid/location/Location;

    invoke-static {v0, p1}, Lpc/j;->d(Lgg/A;Landroid/location/Location;)LYg/J;

    move-result-object p1

    return-object p1
.end method
