.class final Ldd/c$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/c$b$a;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ldd/c$b$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldd/c$b$a$a;

    invoke-direct {v0}, Ldd/c$b$a$a;-><init>()V

    sput-object v0, Ldd/c$b$a$a;->a:Ldd/c$b$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcd/a$d;)LYg/s;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcd/a$d;

    invoke-virtual {p0, p1}, Ldd/c$b$a$a;->a(Lcd/a$d;)LYg/s;

    move-result-object p1

    return-object p1
.end method
