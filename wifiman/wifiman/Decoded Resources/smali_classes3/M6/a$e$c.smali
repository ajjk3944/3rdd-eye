.class LM6/a$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a$e;->c(LP6/F;)Lkg/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/F;

.field final synthetic b:LM6/a$e;


# direct methods
.method constructor <init>(LM6/a$e;LP6/F;)V
    .locals 0

    iput-object p1, p0, LM6/a$e$c;->b:LM6/a$e;

    iput-object p2, p0, LM6/a$e$c;->a:LP6/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public test(Ljava/lang/Object;)Z
    .locals 0

    iget-object p1, p0, LM6/a$e$c;->a:LP6/F;

    invoke-virtual {p1}, LP6/F;->b()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
