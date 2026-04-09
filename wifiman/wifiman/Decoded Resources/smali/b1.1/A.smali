.class public final synthetic Lb1/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c;


# instance fields
.field public final synthetic a:Lb1/B;


# direct methods
.method public synthetic constructor <init>(Lb1/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/A;->a:Lb1/B;

    return-void
.end method


# virtual methods
.method public final b(F)F
    .locals 1

    iget-object v0, p0, Lb1/A;->a:Lb1/B;

    invoke-static {v0, p1}, Lb1/B;->D(Lb1/B;F)F

    move-result p1

    return p1
.end method
