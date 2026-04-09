.class public final Ld/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a$b;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld/a$d;


# direct methods
.method public constructor <init>(Ld/a$d;)V
    .locals 0

    iput-object p1, p0, Ld/a$b$a;->a:Ld/a$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Ld/a$b$a;->a:Ld/a$d;

    invoke-virtual {v0}, Lc/F;->h()V

    return-void
.end method
