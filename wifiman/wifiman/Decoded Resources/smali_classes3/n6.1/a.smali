.class public Ln6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/b;


# instance fields
.field private final a:Lw6/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v0

    iput-object v0, p0, Ln6/a;->a:Lw6/c;

    return-void
.end method


# virtual methods
.method public a()Lw6/c;
    .locals 1

    iget-object v0, p0, Ln6/a;->a:Lw6/c;

    return-object v0
.end method
