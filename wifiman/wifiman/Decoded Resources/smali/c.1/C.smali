.class public final synthetic Lc/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/D;


# direct methods
.method public synthetic constructor <init>(Lc/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/C;->a:Lc/D;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc/C;->a:Lc/D;

    invoke-static {v0}, Lc/D;->a(Lc/D;)V

    return-void
.end method
