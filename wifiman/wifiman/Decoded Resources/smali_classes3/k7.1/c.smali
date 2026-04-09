.class public final synthetic Lk7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lk7/d;


# direct methods
.method public synthetic constructor <init>(Lk7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/c;->a:Lk7/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk7/c;->a:Lk7/d;

    invoke-static {v0}, Lk7/d;->b(Lk7/d;)V

    return-void
.end method
