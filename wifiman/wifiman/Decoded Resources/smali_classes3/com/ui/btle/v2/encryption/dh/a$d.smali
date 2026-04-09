.class final Lcom/ui/btle/v2/encryption/dh/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/encryption/dh/a;->j()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/v2/encryption/dh/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/v2/encryption/dh/a$d;

    invoke-direct {v0}, Lcom/ui/btle/v2/encryption/dh/a$d;-><init>()V

    sput-object v0, Lcom/ui/btle/v2/encryption/dh/a$d;->a:Lcom/ui/btle/v2/encryption/dh/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/ui/btle/v2/encryption/dh/a$d$a;->a:Lcom/ui/btle/v2/encryption/dh/a$d$a;

    invoke-static {p1}, Lb9/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/encryption/dh/a$d;->a(Lhg/c;)V

    return-void
.end method
