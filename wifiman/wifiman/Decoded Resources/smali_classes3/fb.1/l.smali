.class public final synthetic Lfb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lfb/k;


# direct methods
.method public synthetic constructor <init>(Lfb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/l;->a:Lfb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lfb/l;->a:Lfb/k;

    invoke-static {v0}, Lfb/k$b;->a(Lfb/k;)V

    return-void
.end method
