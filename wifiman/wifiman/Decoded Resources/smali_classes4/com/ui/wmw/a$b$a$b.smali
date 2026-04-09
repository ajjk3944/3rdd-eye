.class final Lcom/ui/wmw/a$b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b$a;->a(Ljava/lang/Integer;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/a$b$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/a$b$a$b;

    invoke-direct {v0}, Lcom/ui/wmw/a$b$a$b;-><init>()V

    sput-object v0, Lcom/ui/wmw/a$b$a$b;->a:Lcom/ui/wmw/a$b$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/a;)LDj/a;
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LT8/b;->a()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/a;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b$a$b;->a(Lcom/ui/btle/v2/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
