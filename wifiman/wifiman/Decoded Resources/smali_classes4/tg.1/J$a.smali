.class final Ltg/J$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;


# direct methods
.method constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/J$a;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ltg/J$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method
