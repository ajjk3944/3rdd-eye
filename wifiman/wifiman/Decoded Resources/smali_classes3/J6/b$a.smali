.class LJ6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ6/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI6/a;)LJ6/d;
    .locals 1

    new-instance v0, LJ6/d;

    invoke-direct {v0, p1}, LJ6/d;-><init>(LI6/a;)V

    return-object v0
.end method
