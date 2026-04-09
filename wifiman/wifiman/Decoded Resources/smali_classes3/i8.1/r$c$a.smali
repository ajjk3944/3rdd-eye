.class final Li8/r$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r$c;->a(Li8/a$a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Li8/r$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/r$c$a;

    invoke-direct {v0}, Li8/r$c$a;-><init>()V

    sput-object v0, Li8/r$c$a;->a:Li8/r$c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxe/F;)Lxe/f$a$b$a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxe/f$a$b$a;

    invoke-direct {v0, p1}, Lxe/f$a$b$a;-><init>(Lxe/F;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxe/F;

    invoke-virtual {p0, p1}, Li8/r$c$a;->a(Lxe/F;)Lxe/f$a$b$a;

    move-result-object p1

    return-object p1
.end method
