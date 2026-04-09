.class final Ltg/j$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/j$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field final synthetic b:Ltg/j$a;


# direct methods
.method constructor <init>(Ltg/j$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Ltg/j$a$c;->b:Ltg/j$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltg/j$a$c;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ltg/j$a$c;->b:Ltg/j$a;

    iget-object v0, v0, Ltg/j$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/j$a$c;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method
