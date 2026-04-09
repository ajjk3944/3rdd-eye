.class public final synthetic Ljb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Ljb/g;


# direct methods
.method public synthetic constructor <init>(Ljb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/d;->a:Ljb/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ljb/d;->a:Ljb/g;

    invoke-static {v0}, Ljb/g;->b(Ljb/g;)V

    return-void
.end method
