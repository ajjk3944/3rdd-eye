.class public final synthetic Lba/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lba/t;


# direct methods
.method public synthetic constructor <init>(Lba/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/s;->a:Lba/t;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lba/s;->a:Lba/t;

    invoke-static {v0}, Lba/t;->C0(Lba/t;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
