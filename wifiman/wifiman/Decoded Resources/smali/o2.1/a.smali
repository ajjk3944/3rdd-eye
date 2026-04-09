.class public final synthetic Lo2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lgg/n;


# direct methods
.method public synthetic constructor <init>(Lgg/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/a;->a:Lgg/n;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo2/a;->a:Lgg/n;

    invoke-static {v0, p1}, Lo2/d;->c(Lgg/n;Ljava/lang/Object;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
