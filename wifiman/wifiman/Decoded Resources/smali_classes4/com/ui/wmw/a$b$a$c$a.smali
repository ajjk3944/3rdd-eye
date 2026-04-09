.class final Lcom/ui/wmw/a$b$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b$a$c;->a(LT8/b$d;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/a$b$a$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/a$b$a$c$a;

    invoke-direct {v0}, Lcom/ui/wmw/a$b$a$c$a;-><init>()V

    sput-object v0, Lcom/ui/wmw/a$b$a$c$a;->a:Lcom/ui/wmw/a$b$a$c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/k;)LDj/a;
    .locals 2

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/k;->i()Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->c0()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/WMWizard$a$a$a$a;

    invoke-direct {v1, p1}, Lcom/ui/wmw/WMWizard$a$a$a$a;-><init>(Lcom/ui/wmw/g;)V

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/k;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b$a$c$a;->a(Lcom/ui/wmw/k;)LDj/a;

    move-result-object p1

    return-object p1
.end method
